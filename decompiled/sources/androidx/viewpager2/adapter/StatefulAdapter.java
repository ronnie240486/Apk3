package androidx.viewpager2.adapter;

/* JADX INFO: loaded from: classes2.dex */
public interface StatefulAdapter {
    void restoreState(@androidx.annotation.NonNull android.os.Parcelable r1);

    @androidx.annotation.NonNull
    android.os.Parcelable saveState();
}
