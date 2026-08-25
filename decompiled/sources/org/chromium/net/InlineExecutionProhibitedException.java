package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public final class InlineExecutionProhibitedException extends java.util.concurrent.RejectedExecutionException {
    public InlineExecutionProhibitedException() {
            r1 = this;
            java.lang.String r0 = "Inline execution is prohibited for this request"
            r1.<init>(r0)
            return
    }
}
