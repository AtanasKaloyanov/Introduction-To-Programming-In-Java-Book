package org.example.T01TagsRemoving;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        Input 1:

        <html>
        <head><title>Welcome to our site!</title></head>
        <body>
        <center>
         <img src="/en/img/logo.gif" width="130" height="70" alt="Logo">
         <br><br><br>
         <font size="-1"><a href="/index.html">Home</a>
         <a href="/contacts.html">Contacts</a>
         <a href="/about.html">About</a></font><p>
         </center>
         </body>
         </html>

         Output 1:

         Welcome to our site!
         Home
         Contacts
         About

        Input 2:

        <html><body>
        Click<a href="info.html">on this
        link</a>for more info.<br />
        This is<b>bold</b>text.
        </body></html>

        Output 2:

        Click
        on this
        link
        for more info.
        This is
        bold
        text.
         */
    }
}