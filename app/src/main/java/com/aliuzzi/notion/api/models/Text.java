
package com.aliuzzi.notion.api.models;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Text implements Serializable, Parcelable
{

    @SerializedName("content")
    @Expose
    public String content;
    @SerializedName("link")
    @Expose
    public Object link;
    public final static Creator<Text> CREATOR = new Creator<Text>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Text createFromParcel(android.os.Parcel in) {
            return new Text(in);
        }

        public Text[] newArray(int size) {
            return (new Text[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7766259836853974035L;

    protected Text(android.os.Parcel in) {
        this.content = ((String) in.readValue((String.class.getClassLoader())));
        this.link = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Text() {
    }

    public Text withContent(String content) {
        this.content = content;
        return this;
    }

    public Text withLink(Object link) {
        this.link = link;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Text.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
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
        result = ((result* 31)+((this.link == null)? 0 :this.link.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Text) == false) {
            return false;
        }
        Text rhs = ((Text) other);
        return (((this.link == rhs.link)||((this.link!= null)&&this.link.equals(rhs.link)))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(content);
        dest.writeValue(link);
    }

    public int describeContents() {
        return  0;
    }

}
