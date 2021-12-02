package com.example.JSONPlaceHolder;

public class JPPhoto {
    private short albumId;
    private short id;
    private String title;
    private String url;
    private String thumbnailUrl;

    public short getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(short albumId) {
        this.albumId = albumId;
    }

    public short getId() {
        return this.id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }


}
