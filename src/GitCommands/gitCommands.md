git log --oneline
git log --oneline --graph
gitk


git config --global color.ui true


git branch -r # for viewing all remote branches

git fetch

git remote show upstream

git log HEAD~1 --oneline

git log upstream/master..develop --oneline

git branch -d <branch-name>
git branch -D <branch-name>


git commit --amend
git commit --amend --no-edit

#git checkout command can be used only before git add command
git checkout -- <filename>
git checkout -- .

#git reset HEAD command can be used only after git add command
git reset HEAD <fileName>

git reset <commitId>


git config --global rerere.enabled true
#Commands for running rebase
git fetch upstream
git rebase upstream/develop

this line is in learning_rebase branch , used for (nikhil inside learning_rebase)learning rebase command

