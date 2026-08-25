package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public interface OnNewIntentProvider {
    void addOnNewIntentListener(@androidx.annotation.NonNull androidx.core.util.Consumer<android.content.Intent> r1);

    void removeOnNewIntentListener(@androidx.annotation.NonNull androidx.core.util.Consumer<android.content.Intent> r1);
}
