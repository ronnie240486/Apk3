package io.realm.mongodb.sync;

/* JADX INFO: loaded from: classes.dex */
@io.realm.internal.Keep
public interface SubscriptionSet$StateChangeCallback {
    void onError(java.lang.Throwable r1);

    void onStateChange(io.realm.mongodb.sync.SubscriptionSet r1);
}
