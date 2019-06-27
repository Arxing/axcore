package org.arxing.axutils_android;

import android.content.Context;

public class AssertUtils {

    /*error*/

    public static void error(boolean condition, Error err) {
        if (condition) {
            throw err;
        }
    }

    public static void error(boolean condition) {
        error(condition, new Error());
    }

    public static void error(boolean condition, String format, Object... objs) {
        error(condition, new Error(String.format(format, objs)));
    }

    public static void error(boolean condition, Context context, int resId, Object... objs) {
        error(condition, context.getString(resId), objs);
    }

    public static void throwError(Error err) {
        error(true, err);
    }

    public static void throwError(String format, Object... objs) {
        throwError(new Error(String.format(format, objs)));
    }

    public static void throwError(Context context, int resId, Object... objs) {
        throwError(context.getString(resId), objs);
    }

    /*exception*/

    public static void exception(boolean condition, Exception ex) throws Exception {
        if (condition) {
            throw ex;
        }
    }

    public static void exception(boolean condition) throws Exception {
        exception(condition, new Exception());
    }

    public static void exception(boolean condition, String format, Object... objs) throws Exception {
        exception(condition, new Exception(String.format(format, objs)));
    }

    public static void exception(boolean condition, Context context, int resId, Object... objs) throws Exception {
        exception(condition, context.getString(resId), objs);
    }

    public static void throwException(Exception ex) throws Exception {
        exception(true, ex);
    }

    public static void throwException(String format, Object... objs) throws Exception {
        throwException(new Exception(String.format(format, objs)));
    }

    public static void throwException(Context context, int resId, Object... objs) throws Exception {
        throwException(context.getString(resId), objs);
    }
}
