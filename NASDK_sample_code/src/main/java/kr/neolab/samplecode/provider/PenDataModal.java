package kr.neolab.samplecode.provider;

import java.sql.Blob;

public class PenDataModal {

    int id;
    int section_id;
    int owner_id;
    int note_id;
    int page_id;
    int color;
    int thickness;
    int time_start;
    int time_end;
    byte[] dots;
    int dot_count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public int getNote_id() {
        return note_id;
    }

    public void setNote_id(int note_id) {
        this.note_id = note_id;
    }

    public int getPage_id() {
        return page_id;
    }

    public void setPage_id(int page_id) {
        this.page_id = page_id;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public int getTime_start() {
        return time_start;
    }

    public void setTime_start(int time_start) {
        this.time_start = time_start;
    }

    public int getTime_end() {
        return time_end;
    }

    public void setTime_end(int time_end) {
        this.time_end = time_end;
    }

    public byte[] getDots() {
        return dots;
    }

    public void setDots(byte[] dots) {
        this.dots = dots;
    }

    public int getDot_count() {
        return dot_count;
    }

    public void setDot_count(int dot_count) {
        this.dot_count = dot_count;
    }

    // constructor
    public PenDataModal(int id,
                        int section_id,
                        int owner_id,
                        int note_id,
                        int page_id,
                        int color,
                        int thickness,
                        int time_start,
                        int time_end,
                        byte[] dots,
                        int dot_count) {

        this.id = id;
        this.section_id = section_id;
        this.owner_id = owner_id;
        this.note_id = note_id;
        this.page_id = page_id;
        this.color = color;
        this.thickness = thickness;
        this.time_start = time_start;
        this.time_end = time_end;
        this.dots = dots;
        this.dot_count = dot_count;
    }
}
