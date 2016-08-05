package com.nhutdu.core.model.entities;

import com.google.gson.annotations.SerializedName;

import java.sql.Date;

/**
 * Created by TVG on 7/19/16.
 */
public abstract class Entity {

    //region Properties

    @SerializedName("id")
    private int mId;

    @SerializedName("created_at")
    private Date mCreatedAt;

    @SerializedName("updated_at")
    private Date mUpdatedAt;

    @SerializedName("delete_at")
    private Date mDeleteAt;

    //endregion

    //region Setter and Getter

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public Date getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        mCreatedAt = createdAt;
    }

    public Date getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public Date getDeleteAt() {
        return mDeleteAt;
    }

    public void setDeleteAt(Date mDeleteAt) {
        this.mDeleteAt = mDeleteAt;
    }
    //endregion

    //region Constructors

    protected Entity() {
    }

    //endregion

    //region IBuilder interface

    public interface IBuilder<T> {

        T build();

    }

    //endregion

}
