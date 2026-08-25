package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NotificationCompatSideChannelService extends android.app.Service {

    /* JADX INFO: loaded from: classes.dex */
    public class NotificationSideChannelStub extends android.support.v4.app.INotificationSideChannel.Stub {
        public final /* synthetic */ androidx.core.app.NotificationCompatSideChannelService this$0;

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(java.lang.String r4, int r5, java.lang.String r6) throws android.os.RemoteException {
                r3 = this;
                androidx.core.app.NotificationCompatSideChannelService r0 = r3.this$0
                int r1 = android.os.Binder.getCallingUid()
                r0.checkPermission(r1, r4)
                long r0 = android.os.Binder.clearCallingIdentity()
                androidx.core.app.NotificationCompatSideChannelService r2 = r3.this$0     // Catch: java.lang.Throwable -> L16
                r2.cancel(r4, r5, r6)     // Catch: java.lang.Throwable -> L16
                android.os.Binder.restoreCallingIdentity(r0)
                return
            L16:
                r4 = move-exception
                android.os.Binder.restoreCallingIdentity(r0)
                throw r4
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(java.lang.String r4) {
                r3 = this;
                androidx.core.app.NotificationCompatSideChannelService r0 = r3.this$0
                int r1 = android.os.Binder.getCallingUid()
                r0.checkPermission(r1, r4)
                long r0 = android.os.Binder.clearCallingIdentity()
                androidx.core.app.NotificationCompatSideChannelService r2 = r3.this$0     // Catch: java.lang.Throwable -> L16
                r2.cancelAll(r4)     // Catch: java.lang.Throwable -> L16
                android.os.Binder.restoreCallingIdentity(r0)
                return
            L16:
                r4 = move-exception
                android.os.Binder.restoreCallingIdentity(r0)
                throw r4
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(java.lang.String r4, int r5, java.lang.String r6, android.app.Notification r7) throws android.os.RemoteException {
                r3 = this;
                androidx.core.app.NotificationCompatSideChannelService r0 = r3.this$0
                int r1 = android.os.Binder.getCallingUid()
                r0.checkPermission(r1, r4)
                long r0 = android.os.Binder.clearCallingIdentity()
                androidx.core.app.NotificationCompatSideChannelService r2 = r3.this$0     // Catch: java.lang.Throwable -> L16
                r2.notify(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L16
                android.os.Binder.restoreCallingIdentity(r0)
                return
            L16:
                r4 = move-exception
                android.os.Binder.restoreCallingIdentity(r0)
                throw r4
        }
    }

    public NotificationCompatSideChannelService() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void cancel(java.lang.String r1, int r2, java.lang.String r3);

    public abstract void cancelAll(java.lang.String r1);

    public final void checkPermission(int r5, java.lang.String r6) {
            r4 = this;
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String[] r0 = r0.getPackagesForUid(r5)
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto La
        L18:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NotificationSideChannelService: Uid "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " is not authorized for package "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public abstract void notify(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            java.lang.String r2 = r2.getAction()
            java.lang.String r0 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r2.equals(r0)
            r2 = 0
            return r2
    }
}
