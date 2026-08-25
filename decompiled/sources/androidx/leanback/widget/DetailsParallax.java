package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class DetailsParallax extends androidx.leanback.widget.RecyclerViewParallax {
    public final androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty mFrameBottom;
    public final androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty mFrameTop;

    public DetailsParallax() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "overviewRowTop"
            android.util.Property r0 = r3.addProperty(r0)
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r0 = (androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty) r0
            r1 = 0
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r0 = r0.adapterPosition(r1)
            int r2 = androidx.leanback.R.id.details_frame
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r0 = r0.viewId(r2)
            r3.mFrameTop = r0
            java.lang.String r0 = "overviewRowBottom"
            android.util.Property r0 = r3.addProperty(r0)
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r0 = (androidx.leanback.widget.RecyclerViewParallax.ChildPositionProperty) r0
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r0 = r0.adapterPosition(r1)
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r0 = r0.viewId(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r0 = r0.fraction(r1)
            r3.mFrameBottom = r0
            return
    }

    public androidx.leanback.widget.Parallax.IntProperty getOverviewRowBottom() {
            r1 = this;
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r0 = r1.mFrameBottom
            return r0
    }

    public androidx.leanback.widget.Parallax.IntProperty getOverviewRowTop() {
            r1 = this;
            androidx.leanback.widget.RecyclerViewParallax$ChildPositionProperty r0 = r1.mFrameTop
            return r0
    }
}
