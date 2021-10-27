
package com.aliuzzi.notion.api.models;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result implements Serializable, Parcelable
{

    @SerializedName("object")
    @Expose
    public String object;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("created_time")
    @Expose
    public String createdTime;
    @SerializedName("last_edited_time")
    @Expose
    public String lastEditedTime;
    @SerializedName("cover")
    @Expose
    public Object cover;
    @SerializedName("icon")
    @Expose
    public Object icon;
    @SerializedName("parent")
    @Expose
    public Parent parent;
    @SerializedName("archived")
    @Expose
    public boolean archived;
    @SerializedName("properties")
    @Expose
    public Properties properties;
    @SerializedName("url")
    @Expose
    public String url;
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(android.os.Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;
    private final static long serialVersionUID = 4084587903035960671L;

    protected Result(android.os.Parcel in) {
        this.object = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.createdTime = ((String) in.readValue((String.class.getClassLoader())));
        this.lastEditedTime = ((String) in.readValue((String.class.getClassLoader())));
        this.cover = ((Object) in.readValue((Object.class.getClassLoader())));
        this.icon = ((Object) in.readValue((Object.class.getClassLoader())));
        this.parent = ((Parent) in.readValue((Parent.class.getClassLoader())));
        this.archived = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.properties = ((Properties) in.readValue((Properties.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Result() {
    }

    public Result withObject(String object) {
        this.object = object;
        return this;
    }

    public Result withId(String id) {
        this.id = id;
        return this;
    }

    public Result withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public Result withLastEditedTime(String lastEditedTime) {
        this.lastEditedTime = lastEditedTime;
        return this;
    }

    public Result withCover(Object cover) {
        this.cover = cover;
        return this;
    }

    public Result withIcon(Object icon) {
        this.icon = icon;
        return this;
    }

    public Result withParent(Parent parent) {
        this.parent = parent;
        return this;
    }

    public Result withArchived(boolean archived) {
        this.archived = archived;
        return this;
    }

    public Result withProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    public Result withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("createdTime");
        sb.append('=');
        sb.append(((this.createdTime == null)?"<null>":this.createdTime));
        sb.append(',');
        sb.append("lastEditedTime");
        sb.append('=');
        sb.append(((this.lastEditedTime == null)?"<null>":this.lastEditedTime));
        sb.append(',');
        sb.append("cover");
        sb.append('=');
        sb.append(((this.cover == null)?"<null>":this.cover));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("archived");
        sb.append('=');
        sb.append(this.archived);
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
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
        result = ((result* 31)+((this.lastEditedTime == null)? 0 :this.lastEditedTime.hashCode()));
        result = ((result* 31)+((this.cover == null)? 0 :this.cover.hashCode()));
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+(this.archived? 1 : 0));
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.createdTime == null)? 0 :this.createdTime.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.object == null)? 0 :this.object.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return (((((((((((this.lastEditedTime == rhs.lastEditedTime)||((this.lastEditedTime!= null)&&this.lastEditedTime.equals(rhs.lastEditedTime)))&&((this.cover == rhs.cover)||((this.cover!= null)&&this.cover.equals(rhs.cover))))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&(this.archived == rhs.archived))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.createdTime == rhs.createdTime)||((this.createdTime!= null)&&this.createdTime.equals(rhs.createdTime))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.object == rhs.object)||((this.object!= null)&&this.object.equals(rhs.object))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(object);
        dest.writeValue(id);
        dest.writeValue(createdTime);
        dest.writeValue(lastEditedTime);
        dest.writeValue(cover);
        dest.writeValue(icon);
        dest.writeValue(parent);
        dest.writeValue(archived);
        dest.writeValue(properties);
        dest.writeValue(url);
    }

    public int describeContents() {
        return  0;
    }

}
