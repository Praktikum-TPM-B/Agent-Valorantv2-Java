package com.maulanakurnia.agentvalorantv2.model;

public class AgentModel {
    private String image,name,role,summary;

    public AgentModel(String image, String name, String role, String summary) {
        this.image   = image;
        this.name    = name;
        this.role    = role;
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    public String getSummary() {
        return summary;
    }
}
