package com.cohleague.api.dto;

import com.cohleague.api.enums.TournamentTypeEnum;

public class TournamentDTO {
    public String title;
    public String description;
    public int teamSize;
    public int playerNumber;
    public String startDate;
    public String endDate;
    public boolean isOpen;
    public String createrKey;
    public String tournamentDocId;
    public boolean hasImage;
    public boolean hasThumbnail;
    public TournamentTypeEnum TournamentTypeEnum;
    public boolean liveStatus;
    public String image;
    public boolean displayImage;
    public boolean hasWinner;

    //Optionals
    public String imageFile;
    public String thumbnail;
    public String imageUrl;
    public String imageId;
    public TeamDetails winner;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    public String getCreaterKey() {
        return createrKey;
    }
    public void setCreaterKey(String createrKey) {
        this.createrKey = createrKey;
    }
    public String getTournamentDocId() {
        return tournamentDocId;
    }
    public void setTournamentDocId(String tournamentDocId) {
        this.tournamentDocId = tournamentDocId;
    }
    public boolean isHasImage() {
        return hasImage;
    }
    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }
    public boolean isHasThumbnail() {
        return hasThumbnail;
    }
    public void setHasThumbnail(boolean hasThumbnail) {
        this.hasThumbnail = hasThumbnail;
    }
    public TournamentTypeEnum getTournamentTypeEnum() {
        return TournamentTypeEnum;
    }
    public void setTournamentTypeEnum(TournamentTypeEnum tournamentTypeEnum) {
        TournamentTypeEnum = tournamentTypeEnum;
    }
    public boolean isLiveStatus() {
        return liveStatus;
    }
    public void setLiveStatus(boolean liveStatus) {
        this.liveStatus = liveStatus;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public boolean isDisplayImage() {
        return displayImage;
    }
    public void setDisplayImage(boolean displayImage) {
        this.displayImage = displayImage;
    }
    public boolean isHasWinner() {
        return hasWinner;
    }
    public void setHasWinner(boolean hasWinner) {
        this.hasWinner = hasWinner;
    }
    public String getImageFile() {
        return imageFile;
    }
    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }
    public String getThumbnail() {
        return thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getImageId() {
        return imageId;
    }
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    public TeamDetails getWinner() {
        return winner;
    }
    public void setWinner(TeamDetails winner) {
        this.winner = winner;
    }
    
      
  
}
