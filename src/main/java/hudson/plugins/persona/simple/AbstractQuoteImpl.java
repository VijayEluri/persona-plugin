/*
 * The MIT License
 *
 * Copyright (c) 2010-2012, InfraDNA, Inc., Seiji Sogabe
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.persona.simple;

import hudson.model.InvisibleAction;
import hudson.plugins.persona.Quote;
import hudson.plugins.persona.random.RandomPersona;
import hudson.plugins.persona.selector.LocationSelector;

/**
 * Default implementation of quote that renders a simple non-localized text.
 *
 * @author Kohsuke Kawaguchi
 */
public abstract class AbstractQuoteImpl extends InvisibleAction implements Quote {

    public final SimplePersona persona;

    public AbstractQuoteImpl(SimplePersona persona) {
        if (persona instanceof RandomPersona) {
            this.persona = ((RandomPersona) persona).getCurrentPersona();
        } else {
            this.persona = persona;
        }
    }

    public abstract String getQuote();

    public abstract Image getImage();
    
    public abstract LocationSelector getLocationSelector();
}
