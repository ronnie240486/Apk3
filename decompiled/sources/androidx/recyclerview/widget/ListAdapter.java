package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListAdapter<T, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    private final androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> mListener;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ListAdapter$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public class AnonymousClass1 implements androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> {
        @Override // androidx.recyclerview.widget.AsyncListDiffer.ListListener
        public void onCurrentListChanged(@androidx.annotation.NonNull java.util.List<T> r1, @androidx.annotation.NonNull java.util.List<T> r2) {
                r0 = this;
                r1 = 0
                throw r1
        }
    }

    @androidx.annotation.NonNull
    public java.util.List<T> getCurrentList() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public void onCurrentListChanged(@androidx.annotation.NonNull java.util.List<T> r1, @androidx.annotation.NonNull java.util.List<T> r2) {
            r0 = this;
            return
    }

    public void submitList(@androidx.annotation.Nullable java.util.List<T> r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void submitList(@androidx.annotation.Nullable java.util.List<T> r1, @androidx.annotation.Nullable java.lang.Runnable r2) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
