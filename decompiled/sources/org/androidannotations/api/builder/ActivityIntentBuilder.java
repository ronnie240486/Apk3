package org.androidannotations.api.builder;

import org.androidannotations.api.builder.ActivityIntentBuilder;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityIntentBuilder<I extends org.androidannotations.api.builder.ActivityIntentBuilder<I>> extends org.androidannotations.api.builder.IntentBuilder<I> {
    public ActivityIntentBuilder(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ActivityIntentBuilder(android.content.Context r1, java.lang.Class<?> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public void start() {
            r2 = this;
            android.content.Context r0 = r2.context
            android.content.Intent r1 = r2.intent
            r0.startActivity(r1)
            return
    }

    public void startForResult(int r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto Le
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.Intent r1 = r2.intent
            r0.startActivityForResult(r1, r3)
            goto L13
        Le:
            android.content.Intent r3 = r2.intent
            r0.startActivity(r3)
        L13:
            return
    }
}
