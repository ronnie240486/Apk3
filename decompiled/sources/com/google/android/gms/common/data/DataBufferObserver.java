package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public interface DataBufferObserver {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface Observable {
        void addObserver(@androidx.annotation.NonNull com.google.android.gms.common.data.DataBufferObserver r1);

        void removeObserver(@androidx.annotation.NonNull com.google.android.gms.common.data.DataBufferObserver r1);
    }

    void onDataChanged();

    void onDataRangeChanged(int r1, int r2);

    void onDataRangeInserted(int r1, int r2);

    void onDataRangeMoved(int r1, int r2, int r3);

    void onDataRangeRemoved(int r1, int r2);
}
