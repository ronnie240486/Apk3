package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface ParcelableCompatCreatorCallbacks<T> {
    T createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2);

    T[] newArray(int r1);
}
