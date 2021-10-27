
package com.aliuzzi.notion.api.models;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DatabaseQuery implements Serializable, Parcelable
{

    @SerializedName("object")
    @Expose
    public String object;
    @SerializedName("results")
    @Expose
    public List<Result> results = null;
    @SerializedName("next_cursor")
    @Expose
    public Object nextCursor;
    @SerializedName("has_more")
    @Expose
    public boolean hasMore;
    public final static Creator<DatabaseQuery> CREATOR = new Creator<DatabaseQuery>() {


        @SuppressWarnings({
            "unchecked"
        })
        public DatabaseQuery createFromParcel(android.os.Parcel in) {
            return new DatabaseQuery(in);
        }

        public DatabaseQuery[] newArray(int size) {
            return (new DatabaseQuery[size]);
        }

    }
    ;
    private final static long serialVersionUID = 84588475101910646L;

    protected DatabaseQuery(android.os.Parcel in) {
        this.object = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.results, (com.aliuzzi.notion.api.models.Result.class.getClassLoader()));
        this.nextCursor = ((Object) in.readValue((Object.class.getClassLoader())));
        this.hasMore = ((boolean) in.readValue((boolean.class.getClassLoader())));
    }

    public DatabaseQuery() {
    }

    public DatabaseQuery withObject(String object) {
        this.object = object;
        return this;
    }

    public DatabaseQuery withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    public DatabaseQuery withNextCursor(Object nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    public DatabaseQuery withHasMore(boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DatabaseQuery.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("nextCursor");
        sb.append('=');
        sb.append(((this.nextCursor == null)?"<null>":this.nextCursor));
        sb.append(',');
        sb.append("hasMore");
        sb.append('=');
        sb.append(this.hasMore);
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
        result = ((result* 31)+((this.nextCursor == null)? 0 :this.nextCursor.hashCode()));
        result = ((result* 31)+(this.hasMore? 1 : 0));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        result = ((result* 31)+((this.object == null)? 0 :this.object.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatabaseQuery) == false) {
            return false;
        }
        DatabaseQuery rhs = ((DatabaseQuery) other);
        return (((((this.nextCursor == rhs.nextCursor)||((this.nextCursor!= null)&&this.nextCursor.equals(rhs.nextCursor)))&&(this.hasMore == rhs.hasMore))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))))&&((this.object == rhs.object)||((this.object!= null)&&this.object.equals(rhs.object))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(object);
        dest.writeList(results);
        dest.writeValue(nextCursor);
        dest.writeValue(hasMore);
    }

    public int describeContents() {
        return  0;
    }

}
