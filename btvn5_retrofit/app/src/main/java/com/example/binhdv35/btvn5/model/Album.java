package com.example.binhdv35.btvn5.model;

public class Album {

    private int albumId, id;
    private String thumbnailUrl, url, title;

    public Album(int albumId, int id, String thumbnailUrl, String url, String title) {
        this.albumId = albumId;
        this.id = id;
        this.thumbnailUrl = thumbnailUrl;
        this.url = url;
        this.title = title;
    }

    public Album() {
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
