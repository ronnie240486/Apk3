package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class SpeechOrbView extends androidx.leanback.widget.SearchOrbView {
    private int mCurrentLevel;
    private boolean mListening;
    private androidx.leanback.widget.SearchOrbView.Colors mListeningOrbColors;
    private androidx.leanback.widget.SearchOrbView.Colors mNotListeningOrbColors;
    private final float mSoundLevelMaxZoom;

    public SpeechOrbView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SpeechOrbView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SpeechOrbView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            r5 = 0
            r3.mCurrentLevel = r5
            r3.mListening = r5
            android.content.res.Resources r4 = r4.getResources()
            int r6 = androidx.leanback.R.fraction.lb_search_bar_speech_orb_max_level_zoom
            r0 = 1
            float r6 = r4.getFraction(r6, r0, r0)
            r3.mSoundLevelMaxZoom = r6
            androidx.leanback.widget.SearchOrbView$Colors r6 = new androidx.leanback.widget.SearchOrbView$Colors
            int r0 = androidx.leanback.R.color.lb_speech_orb_not_recording
            int r0 = r4.getColor(r0)
            int r1 = androidx.leanback.R.color.lb_speech_orb_not_recording_pulsed
            int r1 = r4.getColor(r1)
            int r2 = androidx.leanback.R.color.lb_speech_orb_not_recording_icon
            int r2 = r4.getColor(r2)
            r6.<init>(r0, r1, r2)
            r3.mNotListeningOrbColors = r6
            androidx.leanback.widget.SearchOrbView$Colors r6 = new androidx.leanback.widget.SearchOrbView$Colors
            int r0 = androidx.leanback.R.color.lb_speech_orb_recording
            int r1 = r4.getColor(r0)
            int r4 = r4.getColor(r0)
            r6.<init>(r1, r4, r5)
            r3.mListeningOrbColors = r6
            r3.showNotListening()
            return
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
            r1 = this;
            int r0 = androidx.leanback.R.layout.lb_speech_orb
            return r0
    }

    public void setListeningOrbColors(androidx.leanback.widget.SearchOrbView.Colors r1) {
            r0 = this;
            r0.mListeningOrbColors = r1
            return
    }

    public void setNotListeningOrbColors(androidx.leanback.widget.SearchOrbView.Colors r1) {
            r0 = this;
            r0.mNotListeningOrbColors = r1
            return
    }

    public void setSoundLevel(int r3) {
            r2 = this;
            boolean r0 = r2.mListening
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r2.mCurrentLevel
            if (r3 <= r0) goto L10
            int r3 = r3 - r0
            int r3 = r3 / 2
            int r3 = r3 + r0
            r2.mCurrentLevel = r3
            goto L19
        L10:
            float r3 = (float) r0
            r0 = 1060320051(0x3f333333, float:0.7)
            float r3 = r3 * r0
            int r3 = (int) r3
            r2.mCurrentLevel = r3
        L19:
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2.mSoundLevelMaxZoom
            float r1 = r2.getFocusedZoom()
            float r0 = r0 - r1
            int r1 = r2.mCurrentLevel
            float r1 = (float) r1
            float r0 = r0 * r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            float r0 = r0 + r3
            r2.scaleOrbViewOnly(r0)
            return
    }

    public void showListening() {
            r3 = this;
            androidx.leanback.widget.SearchOrbView$Colors r0 = r3.mListeningOrbColors
            r3.setOrbColors(r0)
            android.content.res.Resources r0 = r3.getResources()
            int r1 = androidx.leanback.R.drawable.lb_ic_search_mic
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r3.setOrbIcon(r0)
            r0 = 1
            r3.animateOnFocus(r0)
            r1 = 0
            r3.enableOrbColorAnimation(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.scaleOrbViewOnly(r2)
            r3.mCurrentLevel = r1
            r3.mListening = r0
            return
    }

    public void showNotListening() {
            r2 = this;
            androidx.leanback.widget.SearchOrbView$Colors r0 = r2.mNotListeningOrbColors
            r2.setOrbColors(r0)
            android.content.res.Resources r0 = r2.getResources()
            int r1 = androidx.leanback.R.drawable.lb_ic_search_mic_out
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r2.setOrbIcon(r0)
            boolean r0 = r2.hasFocus()
            r2.animateOnFocus(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.scaleOrbViewOnly(r0)
            r0 = 0
            r2.mListening = r0
            return
    }
}
