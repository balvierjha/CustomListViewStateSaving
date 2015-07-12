package com.globalspace.bslvir.globalspaceassignment;

/**
 * Created by user on 7/11/2015.
 */
public class ProductItems {
    String itemName, itemDesc, remarks;
    boolean checked;

    public ProductItems(String itemName, String itemDesc, String remarks, boolean checked) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.remarks = remarks;
        this.checked = checked;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
