package org.androidannotations.api.builder;

import org.androidannotations.api.builder.ServiceIntentBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ServiceIntentBuilder<I extends org.androidannotations.api.builder.ServiceIntentBuilder<I>> extends org.androidannotations.api.builder.IntentBuilder<I> {
    public ServiceIntentBuilder(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ServiceIntentBuilder(android.content.Context r1, java.lang.Class<?> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public android.content.ComponentName start() {
            r2 = this;
            android.content.Context r0 = r2.context
            android.content.Intent r1 = r2.intent
            android.content.ComponentName r0 = r0.startService(r1)
            return r0
    }

    public boolean stop() {
            r2 = this;
            android.content.Context r0 = r2.context
            android.content.Intent r1 = r2.intent
            boolean r0 = r0.stopService(r1)
            return r0
    }
}
