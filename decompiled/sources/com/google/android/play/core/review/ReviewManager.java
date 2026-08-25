package com.google.android.play.core.review;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes3.dex */
public interface ReviewManager {
    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<java.lang.Void> launchReviewFlow(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull com.google.android.play.core.review.ReviewInfo r2);

    @androidx.annotation.NonNull
    com.google.android.play.core.tasks.Task<com.google.android.play.core.review.ReviewInfo> requestReviewFlow();
}
