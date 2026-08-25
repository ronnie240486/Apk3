package com.google.common.eventbus;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
public class DeadEvent {
    private final java.lang.Object event;
    private final java.lang.Object source;

    public DeadEvent(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.source = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.event = r1
            return
    }

    public java.lang.Object getEvent() {
            r1 = this;
            java.lang.Object r0 = r1.event
            return r0
    }

    public java.lang.Object getSource() {
            r1 = this;
            java.lang.Object r0 = r1.source
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r3)
            java.lang.Object r1 = r3.source
            java.lang.String r2 = "source"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.Object r1 = r3.event
            java.lang.String r2 = "event"
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
