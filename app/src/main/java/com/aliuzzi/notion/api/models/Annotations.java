
package com.aliuzzi.notion.api.models;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Annotations implements Serializable, Parcelable
{

    @SerializedName("bold")
    @Expose
    public boolean bold;
    @SerializedName("italic")
    @Expose
    public boolean italic;
    @SerializedName("strikethrough")
    @Expose
    public boolean strikethrough;
    @SerializedName("underline")
    @Expose
    public boolean underline;
    @SerializedName("code")
    @Expose
    public boolean code;
    @SerializedName("color")
    @Expose
    public String color;
    public final static Creator<Annotations> CREATOR = new Creator<Annotations>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Annotations createFromParcel(android.os.Parcel in) {
            return new Annotations(in);
        }

        public Annotations[] newArray(int size) {
            return (new Annotations[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8126241021905283786L;

    protected Annotations(android.os.Parcel in) {
        this.bold = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.italic = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.strikethrough = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.underline = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.code = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.color = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Annotations() {
    }

    public Annotations withBold(boolean bold) {
        this.bold = bold;
        return this;
    }

    public Annotations withItalic(boolean italic) {
        this.italic = italic;
        return this;
    }

    public Annotations withStrikethrough(boolean strikethrough) {
        this.strikethrough = strikethrough;
        return this;
    }

    public Annotations withUnderline(boolean underline) {
        this.underline = underline;
        return this;
    }

    public Annotations withCode(boolean code) {
        this.code = code;
        return this;
    }

    public Annotations withColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Annotations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bold");
        sb.append('=');
        sb.append(this.bold);
        sb.append(',');
        sb.append("italic");
        sb.append('=');
        sb.append(this.italic);
        sb.append(',');
        sb.append("strikethrough");
        sb.append('=');
        sb.append(this.strikethrough);
        sb.append(',');
        sb.append("underline");
        sb.append('=');
        sb.append(this.underline);
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(this.code);
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
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
        result = ((result* 31)+(this.code? 1 : 0));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+(this.underline? 1 : 0));
        result = ((result* 31)+(this.bold? 1 : 0));
        result = ((result* 31)+(this.strikethrough? 1 : 0));
        result = ((result* 31)+(this.italic? 1 : 0));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Annotations) == false) {
            return false;
        }
        Annotations rhs = ((Annotations) other);
        return ((((((this.code == rhs.code)&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&(this.underline == rhs.underline))&&(this.bold == rhs.bold))&&(this.strikethrough == rhs.strikethrough))&&(this.italic == rhs.italic));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(bold);
        dest.writeValue(italic);
        dest.writeValue(strikethrough);
        dest.writeValue(underline);
        dest.writeValue(code);
        dest.writeValue(color);
    }

    public int describeContents() {
        return  0;
    }

}
