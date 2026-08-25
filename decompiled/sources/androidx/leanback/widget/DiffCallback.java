package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DiffCallback<Value> {
    public DiffCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean areContentsTheSame(@androidx.annotation.NonNull Value r1, @androidx.annotation.NonNull Value r2);

    public abstract boolean areItemsTheSame(@androidx.annotation.NonNull Value r1, @androidx.annotation.NonNull Value r2);

    public java.lang.Object getChangePayload(@androidx.annotation.NonNull Value r1, @androidx.annotation.NonNull Value r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
