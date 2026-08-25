package io.realm.internal;

/* JADX INFO: loaded from: classes2.dex */
public interface Capabilities {
    boolean canDeliverNotification();

    void checkCanDeliverNotification(@javax.annotation.Nullable java.lang.String r1);

    boolean isMainThread();
}
