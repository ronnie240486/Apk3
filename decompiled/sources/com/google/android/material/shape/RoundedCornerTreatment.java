package com.google.android.material.shape;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedCornerTreatment extends com.google.android.material.shape.CornerTreatment {
    public float radius;

    public RoundedCornerTreatment() {
            r1 = this;
            r1.<init>()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.radius = r0
            return
    }

    @java.lang.Deprecated
    public RoundedCornerTreatment(float r1) {
            r0 = this;
            r0.<init>()
            r0.radius = r1
            return
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@androidx.annotation.NonNull com.google.android.material.shape.ShapePath r8, float r9, float r10, float r11) {
            r7 = this;
            float r0 = r11 * r10
            r1 = 1127481344(0x43340000, float:180.0)
            float r2 = r1 - r9
            r3 = 0
            r8.reset(r3, r0, r1, r2)
            r0 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r0
            float r4 = r11 * r10
            r1 = 0
            r2 = 0
            r5 = 1127481344(0x43340000, float:180.0)
            r0 = r8
            r3 = r4
            r6 = r9
            r0.addArc(r1, r2, r3, r4, r5, r6)
            return
    }
}
