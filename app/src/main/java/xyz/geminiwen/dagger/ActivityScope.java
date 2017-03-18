package xyz.geminiwen.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by geminiwen on 2017/3/18.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
