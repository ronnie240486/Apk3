package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public interface OnPictureInPictureModeChangedProvider {
    void addOnPictureInPictureModeChangedListener(@androidx.annotation.NonNull androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r1);

    void removeOnPictureInPictureModeChangedListener(@androidx.annotation.NonNull androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r1);
}
