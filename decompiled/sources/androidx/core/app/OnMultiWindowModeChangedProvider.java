package androidx.core.app;

/* JADX INFO: loaded from: classes3.dex */
public interface OnMultiWindowModeChangedProvider {
    void addOnMultiWindowModeChangedListener(@androidx.annotation.NonNull androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r1);

    void removeOnMultiWindowModeChangedListener(@androidx.annotation.NonNull androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r1);
}
