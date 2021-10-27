
package com.aliuzzi.notion.api.models;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Parent implements Serializable, Parcelable
{

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("database_id")
    @Expose
    public String databaseId;
    public final static Creator<Parent> CREATOR = new Creator<Parent>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Parent createFromParcel(android.os.Parcel in) {
            return new Parent(in);
        }

        public Parent[] newArray(int size) {
            return (new Parent[size]);
        }

    }
    ;
    private final static long serialVersionUID = -6248187235210828958L;

    protected Parent(android.os.Parcel in) {
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.databaseId = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Parent() {
    }

    public Parent withType(String type) {
        this.type = type;
        return this;
    }

    public Parent withDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Parent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("databaseId");
        sb.append('=');
        sb.append(((this.databaseId == null)?"<null>":this.databaseId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.databaseId == null)? 0 :this.databaseId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parent) == false) {
            return false;
        }
        Parent rhs = ((Parent) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.databaseId == rhs.databaseId)||((this.databaseId!= null)&&this.databaseId.equals(rhs.databaseId))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(databaseId);
    }

    public int describeContents() {
        return  0;
    }

}
