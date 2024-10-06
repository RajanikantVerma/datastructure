## Interview Question

For working on this Please create new branch and after commit merge the code to main

You begin to create a new branch in this way:

Clone repository in your local dir (or create a new repository):
$ cd /var/www
$ git clone git@bitbucket.org:RajanikantVerma/datastructure.git
Create a new branch. It will contain the latest files of your master branch repository
$ git branch new_branch
Change your current git branch to the new_branch
$ git checkout new_branch
Do coding, commits, as usual…
$ git add .
$ git commit -m “Initial commit”
$ git push # pushes commits only to “new_branch”
When job is finished on this branch, merge with “master” branch:
$ git merge master
$ git checkout master # goes to master branch
$ git merge development # merges files in localhost. Master shouldn’t have any  commits ahead, otherwise there will be a need for pull and merging code by hands!
$ git push # pushes all “new_branch” commits to both branches - “master” and “new_bra
