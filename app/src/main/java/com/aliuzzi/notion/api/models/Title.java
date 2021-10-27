
package com.aliuzzi.notion.api.models;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Title implements Serializable, Parcelable
{

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("text")
    @Expose
    public Text text;
    @SerializedName("annotations")
    @Expose
    public Annotations annotations;
    @SerializedName("plain_text")
    @Expose
    public String plainText;
    @SerializedName("href")
    @Expose
    public Object href;
    public final static Creator<Title> CREATOR = new Creator<Title>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Title createFromParcel(android.os.Parcel in) {
            return new Title(in);
        }

        public Title[] newArray(int size) {
            return (new Title[size]);
        }

    }
    ;
    private final static long serialVersionUID = -2048389543935360814L;

    protected Title(android.os.Parcel in) {
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.text = ((Text) in.readValue((Text.class.getClassLoader())));
        this.annotations = ((Annotations) in.readValue((Annotations.class.getClassLoader())));
        this.plainText = ((String) in.readValue((String.class.getClassLoader())));
        this.href = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Title() {
    }

    public Title withType(String type) {
        this.type = type;
        return this;
    }

    public Title withText(Text text) {
        this.text = text;
        return this;
    }

    public Title withAnnotations(Annotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public Title withPlainText(String plainText) {
        this.plainText = plainText;
        return this;
    }

    public Title withHref(Object href) {
        this.href = href;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Title.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("annotations");
        sb.append('=');
        sb.append(((this.annotations == null)?"<null>":this.annotations));
        sb.append(',');
        sb.append("plainText");
        sb.append('=');
        sb.append(((this.plainText == null)?"<null>":this.plainText));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
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
        result = ((result* 31)+((this.annotations == null)? 0 :this.annotations.hashCode()));
        result = ((result* 31)+((this.plainText == null)? 0 :this.plainText.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Title) == false) {
            return false;
        }
        Title rhs = ((Title) other);
        return ((((((this.annotations == rhs.annotations)||((this.annotations!= null)&&this.annotations.equals(rhs.annotations)))&&((this.plainText == rhs.plainText)||((this.plainText!= null)&&this.plainText.equals(rhs.plainText))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(text);
        dest.writeValue(annotations);
        dest.writeValue(plainText);
        dest.writeValue(href);
    }

    public int describeContents() {
        return  0;
    }

}
