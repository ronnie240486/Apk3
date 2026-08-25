package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
public interface ListUpdateCallback {
    void onChanged(int r1, int r2, @androidx.annotation.Nullable java.lang.Object r3);

    void onInserted(int r1, int r2);

    void onMoved(int r1, int r2);

    void onRemoved(int r1, int r2);
}
