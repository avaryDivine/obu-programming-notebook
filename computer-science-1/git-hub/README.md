[GitHub / git](computer-science-i/README.md)
# HW-002-git
https://www.w3schools.com/git/git_intro.asp?remote=github

https://www.freecodecamp.org/news/learn-the-basics-of-git-in-under-10-minutes-da548267cc91/

Demonstrate how to tell git who you are

    In your terminal to tell git who you are you write:

    git config --global user.name "avaryDivine"

    git config --global user.email "avary.divine24@okbu.edu"

Demonstrate creation of a repository in GitHub

    
Demonstrate cloning a GitHub repository to your local repository (local computer)

    To clone you need to get the URL by hitting the green code button on GitHub

    Then in your terminal write:

    git clone URL


Demonstrate how to check the status of (file) changes on your local repository (local computer)

    Writing git status will show you the status of all of the files that are waiting to be committed
    
Demonstrate how to stage changes to your local repository

    Once you finish or finish a major part, you should stage your files. Staged files are files waiting to be committed. To stage a file write:

    git add followed by the name of the file
    
Demonstrate how to commit changes to your local repository

    Once you have finished your work you need to move your files from staged to committed. Remeber to add a message with every commit to sty organized.

    git commit -m "First edit"
    
Demonstrate how to synchronize changes from your local repository to a remote repository

Demonstrate how to synchronize a remote repository to your local repository

Demonstrate how to create a branch in your local repository

    to create a branch you simply type git branch followed by the name of the branch
    
Demonstrate how to switch branches in your local repository

    using git checkout followed by the name of the branch you want to move to will switch branches.
    
Demonstrate how to synchronize your local repository branch with a remote repository branch

    to merge branches make sure you are in the master branch then write

    git merge followed by the branch that you want to merge with the master branch
    
Document a typical git workflow

    the typical flow is as follows

    - Create a new Branch
    - Make changes and add Commits
    - Open a Pull Request
    - Review
    - Deploy
    - Merge
