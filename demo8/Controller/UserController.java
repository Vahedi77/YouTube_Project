package org.example.demo8.Controller;
import org.example.demo8.Model.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class UserController {

    Account user = UserManager.getInstance().getCurrentUser();
    Database database = Database.getDatabase();
    public static boolean AdminLogin=false;
    public static boolean UserLogin=false;

    public void login()
    {
        if (user.getUsername().equals(Admin.getAdmin().getUsername())
                && user.getPassword().equals(Admin.getAdmin().getPassword())) {
            user = Admin.getAdmin();
            AdminLogin = true;
        }
        else {

            for (Account rejisteredUser : database.getAccounts()) {
                if (user.getPassword().equals(rejisteredUser.getPassword()) &&
                        user.getUsername().equals(rejisteredUser.getUsername())) {
                    user = rejisteredUser;
                    UserLogin = true;
                }
            }

        }

    }

    public boolean SignUp() {
        if (user.getFirstNameLastName() != null && !user.getFirstNameLastName().isEmpty()) {
            if (user.getEmail() != null && user.getEmail().matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                if (user.getPhone() != null && user.getPhone().matches("^\\+?[0-9]{10,15}$")) {
                    if (user.getUsername() != null) {
                        RegularUser newUser = (RegularUser) user;
                        database.getAccounts().add(newUser);
                        user = newUser;
                        return true;
                    }

                }
            }

        }
        return false;
    }

    public void logOut() {
        user = null;
    }

    public ArrayList<String> showAccountInformation() {
        ArrayList<String> information=new ArrayList<>();
        information.add(user.getFirstNameLastName());
        information.add(user.getPassword());
        information.add(user.getEmail());
        information.add(user.getPhone());
        information.add(user.getProfilePictureURL());
        return information;
    }

//    public boolean editAccountInformation() {
//
//    }

    public boolean createPlaylist(String namePlayList) {

        if (user instanceof PremiumUser) {
            Playlist playlist = new Playlist(namePlayList);
            ((PremiumUser) user).getPlaylists().add(playlist);
            return true;
        } else if (user instanceof RegularUser) {
            if (((RegularUser) user).getNumberOfPlaylist() < 3) {
                Playlist playlist = new Playlist(namePlayList);
                ((RegularUser) user).getPlaylists().add(playlist);
                return true;
            }
            return false;

        }
        return false;


    }

    public boolean addContentToPlayList(Content content, Playlist playlist) {
        if (user instanceof PremiumUser) {
            for (Playlist playlist1 : ((PremiumUser) user).getPlaylists()) {
                if (playlist.equals(playlist1)) {
                    playlist.getContents().add(content);
                    return true;
                }
            }
            return false;

        }
        if (user instanceof RegularUser) {
            for (Playlist playlist1 : ((RegularUser) user).getPlaylists()) {
                if (playlist.equals(playlist1) && playlist1.getContents().size() < 10) {
                    playlist.getContents().add(content);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean likeContent(Content content) {
        if (content == null) {
            return false;
        }
        if (((User) user).getLikedContent().contains(content)) {
            ((User) user).getLikedContent().remove(content);
            int likeCount = content.getLikeCount();
            content.setLikeCount(likeCount--);
            return true;
        } else {
            int likeCount = content.getLikeCount();
            content.setLikeCount(likeCount++);
            ((User) user).getLikedContent().add(content);
            return true;
        }
    }

    public ArrayList<Content> search(String text) {
        ArrayList<Content> contentResults = (ArrayList<Content>) database.getContents().stream()
                .filter(c -> c.getTitle().contains(text))
                .collect(Collectors.toList());

        ArrayList<Content> channelResults = (ArrayList<Content>) database.getChannels().stream()
                .filter(c -> c.getName().contains(text))
                .flatMap(c -> c.getContents().stream())
                .collect(Collectors.toList());

        ArrayList<Content> combinedResults = new ArrayList<>();
        combinedResults.addAll(contentResults);
        combinedResults.addAll(channelResults);

        return combinedResults;
    }

    public ArrayList<Content> sortContentByPopularity() {
        return (ArrayList<Content>) database.getContents().stream()
                .sorted((c1, c2) -> Integer.compare(c2.getLikeCount(), c1.getLikeCount()))
                .collect(Collectors.toList());
    }

    public ArrayList<Content> sortByViews() {
        return (ArrayList<Content>) database.getContents().stream()
                .sorted((c1, c2) -> Integer.compare(c2.getNumberOfView(), c1.getNumberOfView()))
                .collect(Collectors.toList());
    }

    public ArrayList<Content> filterByType(String type) {
        return (ArrayList<Content>) database.getContents().stream()
                .filter(content -> {
                    if (type.equals("Video")) {
                        return content instanceof Video;
                    } else if (type == "Podcast") {
                        return content instanceof Podcast;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }


    public ArrayList<Content> filterByCategory(Category category) {
        return (ArrayList<Content>) database.getContents().stream()
                .filter(c -> c.getCategory() == category)
                .collect(Collectors.toList());
    }

    public ArrayList<Content> suggestedContentToUser() {
        ArrayList<Content> suggestionContent = new ArrayList<>();
        for (Channel channel : ((User) user).getSubscriptions()) {
            suggestionContent.add(channel.getContents().get(0));
            suggestionContent.add(channel.getContents().get(1));
            suggestionContent.add(channel.getContents().get(2));
        }
        return suggestionContent;
    }


}











