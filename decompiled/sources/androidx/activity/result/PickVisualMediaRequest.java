package androidx.activity.result;

/* JADX INFO: compiled from: PickVisualMediaRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0000¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest;", "", "()V", "<set-?>", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "getMediaType", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "setMediaType$activity_release", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)V", "Builder", "activity_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PickVisualMediaRequest {

    @org.jetbrains.annotations.NotNull
    private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType;

    /* JADX INFO: compiled from: PickVisualMediaRequest.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "()V", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "build", "Landroidx/activity/result/PickVisualMediaRequest;", "setMediaType", "activity_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @org.jetbrains.annotations.NotNull
        private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType;

        public Builder() {
                r1 = this;
                r1.<init>()
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
                r1.mediaType = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.activity.result.PickVisualMediaRequest build() {
                r2 = this;
                androidx.activity.result.PickVisualMediaRequest r0 = new androidx.activity.result.PickVisualMediaRequest
                r0.<init>()
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r1 = r2.mediaType
                r0.setMediaType$activity_release(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.activity.result.PickVisualMediaRequest.Builder setMediaType(@org.jetbrains.annotations.NotNull androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.mediaType = r2
                return r1
        }
    }

    public PickVisualMediaRequest() {
            r1 = this;
            r1.<init>()
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
            r1.mediaType = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
            r1 = this;
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r0 = r1.mediaType
            return r0
    }

    public final void setMediaType$activity_release(@org.jetbrains.annotations.NotNull androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.mediaType = r2
            return
    }
}
