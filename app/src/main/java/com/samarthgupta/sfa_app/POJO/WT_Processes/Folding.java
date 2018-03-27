
package com.samarthgupta.sfa_app.POJO.WT_Processes;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Folding {

    @SerializedName("isRequired")
    @Expose
    private Boolean isRequired;
    @SerializedName("updates")
    @Expose
    private List<UpdatePF> updates = null;

    public Folding() {
        this.isRequired = false;
        this.updates = new ArrayList<>();
        UpdatePF zeroUpdate = new UpdatePF();
        zeroUpdate.setDone("0");
        zeroUpdate.setSetsDone("0");
        Time time = new Time(System.currentTimeMillis());
        zeroUpdate.setTime(time.toString());
        this.updates.add(zeroUpdate);
    }

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public List<UpdatePF> getUpdates() {
        return updates;
    }

    public void setUpdates(List<UpdatePF> updates) {
        this.updates = updates;
    }

}
