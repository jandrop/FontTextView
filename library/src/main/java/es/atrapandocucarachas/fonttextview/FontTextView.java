package es.atrapandocucarachas.fonttextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author Alejandro Platas Mallo
 * @version 1.00
 * @since 12/5/16
 */

public class FontTextView extends TextView {

    public FontTextView(Context context) {
        super(context);
        init(context, null);

    }

    public FontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public FontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.FontTextView, 0, 0);
        try {
            String fontInAssets = ta.getString(R.styleable.FontTextView_font);
            setTypeface(Typefaces.get(context, "fonts/" + fontInAssets));
        } finally {
            ta.recycle();
        }
    }
}
