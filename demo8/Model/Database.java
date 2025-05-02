package org.example.demo8.Model;

import java.util.ArrayList;


public class Database {
    private static Database database;
    private static ArrayList<Account> accounts;
    private static ArrayList<Channel> channels;
    private static ArrayList<Content> contents ;
    private static ArrayList<Report> reports;
    private Database() {
        accounts = new ArrayList<>();
        channels = new ArrayList<>();
        contents = new ArrayList<>();
        reports = new ArrayList<>();

    }

    public static Database getDatabase() {
        if(database==null)
        {
            database=new Database();
        }
        return database;
    }

    public ArrayList<Report> getReports() {
        return reports;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Content> getContents() {
        return contents;
    }

    public ArrayList<Channel> getChannels() {
        return channels;
    }

}
