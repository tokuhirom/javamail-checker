# javamail-checker

## What's this?

This is a JavaMail test program. I need to test the server environment with this app.

## How it works?

This project provides executable fat jar includes javamail impl.

## Usage?

    $ java -Dmail.smtp.host=localhost -jar javamail-checker-0.0.1-SNAPSHOT.jar \
           from@example.com \
           to@example.com

This command send e-mail to `to@example.com` from `from@example.com`.

## How do I test the behaviour on my local machine?

    $ sudo python -u -m smtpd -c DebuggingServer :25

Python distribution bundles built-in smtp server library. You can use it for testing purpose.

## What's license?

    The MIT License (MIT)
    Copyright © 2015 Tokuhiro Matsuno, http://64p.org/ <tokuhirom@gmail.com>

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the “Software”), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.

