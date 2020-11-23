package com.NYTimes.nyTimes;

//command +shift+ 8   ; shift + down arrow;  commmand shift 8 space

import java.util.ArrayList;

public class Results {
    private String section;
    private String subsection;
    private String title;
    private String url;
    private String uri;
    private String byline;
    private String item_type;
    private String update_date;
    private String created_date;
    private String published_date;
    private String material_type_facet;
    private String kicker;
    private ArrayList<String> des_facet;
    private ArrayList<String> org_facet;
    private ArrayList<String> per_facet;
    private ArrayList<String> geo_facet;
    private String short_url;


    public ArrayList<Multimedia> multimedia;

    public Results(String section, String subsection, String title, String url, String uri, String byline, String item_type, String update_date, String created_date, String published_date, String material_type_facet, String kicker, ArrayList<String> des_facet, ArrayList<String> org_facet, ArrayList<String> per_facet, ArrayList<String> geo_facet, String short_url, ArrayList<Multimedia> multimedia) {
        this.section = section;
        this.subsection = subsection;
        this.title = title;
        this.url = url;
        this.uri = uri;
        this.byline = byline;
        this.item_type = item_type;
        this.update_date = update_date;
        this.created_date = created_date;
        this.published_date = published_date;
        this.material_type_facet = material_type_facet;
        this.kicker = kicker;
        this.des_facet = des_facet;
        this.org_facet = org_facet;
        this.per_facet = per_facet;
        this.geo_facet = geo_facet;
        this.short_url = short_url;
        this.multimedia = multimedia;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public void setMaterial_type_facet(String material_type_facet) {
        this.material_type_facet = material_type_facet;
    }

    public String getKicker() {
        return kicker;
    }

    public void setKicker(String kicker) {
        this.kicker = kicker;
    }

    public ArrayList<String> getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(ArrayList<String> des_facet) {
        this.des_facet = des_facet;
    }

    public ArrayList<String> getOrg_facet() {
        return org_facet;
    }

    public void setOrg_facet(ArrayList<String> org_facet) {
        this.org_facet = org_facet;
    }

    public ArrayList<String> getPer_facet() {
        return per_facet;
    }

    public void setPer_facet(ArrayList<String> per_facet) {
        this.per_facet = per_facet;
    }

    public ArrayList<String> getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(ArrayList<String> geo_facet) {
        this.geo_facet = geo_facet;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    public ArrayList<Multimedia> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(ArrayList<Multimedia> multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Results{" +
                "section='" + section + '\'' +
                ", subsection='" + subsection + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", uri='" + uri + '\'' +
                ", byline='" + byline + '\'' +
                ", item_type='" + item_type + '\'' +
                ", update_date='" + update_date + '\'' +
                ", created_date='" + created_date + '\'' +
                ", published_date='" + published_date + '\'' +
                ", material_type_facet='" + material_type_facet + '\'' +
                ", kicker='" + kicker + '\'' +
                ", des_facet=" + des_facet +
                ", org_facet=" + org_facet +
                ", per_facet=" + per_facet +
                ", geo_facet=" + geo_facet +
                ", short_url='" + short_url + '\'' +
                ", multimedia=" + multimedia +
                '}';
    }
}

