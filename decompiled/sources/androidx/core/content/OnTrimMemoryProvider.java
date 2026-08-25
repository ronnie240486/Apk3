package androidx.core.content;

/* JADX INFO: loaded from: classes2.dex */
public interface OnTrimMemoryProvider {
    void addOnTrimMemoryListener(@androidx.annotation.NonNull androidx.core.util.Consumer<java.lang.Integer> r1);

    void removeOnTrimMemoryListener(@androidx.annotation.NonNull androidx.core.util.Consumer<java.lang.Integer> r1);
}
