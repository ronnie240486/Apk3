package androidx.activity.result;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    public ActivityResultLauncher() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public abstract androidx.activity.result.contract.ActivityResultContract<I, ?> getContract();

    public void launch(@android.annotation.SuppressLint({"UnknownNullness"}) I r2) {
            r1 = this;
            r0 = 0
            r1.launch(r2, r0)
            return
    }

    public abstract void launch(@android.annotation.SuppressLint({"UnknownNullness"}) I r1, @androidx.annotation.Nullable androidx.core.app.ActivityOptionsCompat r2);

    @androidx.annotation.MainThread
    public abstract void unregister();
}
