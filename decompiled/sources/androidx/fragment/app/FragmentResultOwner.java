package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public interface FragmentResultOwner {
    void clearFragmentResult(@androidx.annotation.NonNull java.lang.String r1);

    void clearFragmentResultListener(@androidx.annotation.NonNull java.lang.String r1);

    void setFragmentResult(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.os.Bundle r2);

    void setFragmentResultListener(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r2, @androidx.annotation.NonNull androidx.fragment.app.FragmentResultListener r3);
}
