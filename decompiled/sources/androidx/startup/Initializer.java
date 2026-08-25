package androidx.startup;

/* JADX INFO: loaded from: classes2.dex */
public interface Initializer<T> {
    @androidx.annotation.NonNull
    T create(@androidx.annotation.NonNull android.content.Context r1);

    @androidx.annotation.NonNull
    java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies();
}
