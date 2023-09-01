package com.raihan.absensi.kelas;

import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("error")
    private Boolean error;
    @SerializedName("pesan")
    private String pesan;

    public Result(Boolean error, String pesan) {
        this.error = error;
        this.pesan = pesan;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
}
