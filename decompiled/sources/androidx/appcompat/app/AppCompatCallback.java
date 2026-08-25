package androidx.appcompat.app;

/* JADX INFO: loaded from: classes3.dex */
public interface AppCompatCallback {
    void onSupportActionModeFinished(androidx.appcompat.view.ActionMode r1);

    void onSupportActionModeStarted(androidx.appcompat.view.ActionMode r1);

    @androidx.annotation.Nullable
    androidx.appcompat.view.ActionMode onWindowStartingSupportActionMode(androidx.appcompat.view.ActionMode.Callback r1);
}
