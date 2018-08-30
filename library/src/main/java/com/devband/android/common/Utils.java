package com.devband.android.common;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

public class Utils {

    public static void copyToClipboard(Context context, String content) {
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("", content);
        clipboard.setPrimaryClip(clip);
    }
}
