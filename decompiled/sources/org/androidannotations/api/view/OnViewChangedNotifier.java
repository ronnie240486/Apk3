package org.androidannotations.api.view;

/* JADX INFO: loaded from: classes3.dex */
public class OnViewChangedNotifier {
    private static org.androidannotations.api.view.OnViewChangedNotifier currentNotifier;
    private final java.util.List<org.androidannotations.api.view.OnViewChangedListener> listeners;

    public OnViewChangedNotifier() {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.listeners = r0
            return
    }

    public static void registerOnViewChangedListener(org.androidannotations.api.view.OnViewChangedListener r1) {
            org.androidannotations.api.view.OnViewChangedNotifier r0 = org.androidannotations.api.view.OnViewChangedNotifier.currentNotifier
            if (r0 == 0) goto L9
            java.util.List<org.androidannotations.api.view.OnViewChangedListener> r0 = r0.listeners
            r0.add(r1)
        L9:
            return
    }

    public static org.androidannotations.api.view.OnViewChangedNotifier replaceNotifier(org.androidannotations.api.view.OnViewChangedNotifier r1) {
            org.androidannotations.api.view.OnViewChangedNotifier r0 = org.androidannotations.api.view.OnViewChangedNotifier.currentNotifier
            org.androidannotations.api.view.OnViewChangedNotifier.currentNotifier = r1
            return r0
    }

    public void notifyViewChanged(org.androidannotations.api.view.HasViews r3) {
            r2 = this;
            java.util.List<org.androidannotations.api.view.OnViewChangedListener> r0 = r2.listeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            org.androidannotations.api.view.OnViewChangedListener r1 = (org.androidannotations.api.view.OnViewChangedListener) r1
            r1.onViewChanged(r3)
            goto L6
        L16:
            return
    }
}
